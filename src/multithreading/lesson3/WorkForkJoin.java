package multithreading.lesson3;
import java.util.List;
import java.util.concurrent.RecursiveTask;
public class WorkForkJoin extends RecursiveTask<Long> {
    private List<Long> longList;
    private int begin;
    private int end;
    public static final Long TRESHOLD = 10_000L;
    public WorkForkJoin(List<Long> longList, int begin, int end) {
        this.longList = longList;
        this.begin = begin;
        this.end = end;
    }
    public WorkForkJoin(List<Long> list){
        this(list,0,list.size());
    }

    @Override
    protected Long compute() {
        int length = end - begin;
        Long longResult = 0L;
        if(length <= TRESHOLD){
            for (int i = begin; i < end; i++) {
                longResult += longList.get(i);
            }
        }else{
            int middle = begin + length / 2;
            WorkForkJoin leftWorkForJoin = new WorkForkJoin(longList,begin,middle);
            leftWorkForJoin.fork();
            WorkForkJoin rightWorkForJoin = new WorkForkJoin(longList,middle,end);
            rightWorkForJoin.fork();
            Long leftSum = leftWorkForJoin.join();
            Long rightSum = rightWorkForJoin.join();
            longResult = leftSum+rightSum;
        }
        return longResult;
    }
}
