package multithreading.stepikoop26;
public class Comment implements Comparable<Comment>{
    private String Author;
    private String text;
    private  int countLikes;

    public Comment(String author, String text, int countLikes) {
        Author = author;
        this.text = text;
        this.countLikes = countLikes;
    }
    public String getAuthor() {
        return Author;
    }
    public String getText() {
        return text;
    }
    public int getCountLikes() {
        return countLikes;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append(Author).append('#');
        sb.append(text).append('#');
        sb.append(countLikes).append('#');
        return sb.toString();
    }
    @Override
    public int compareTo(Comment o) {
        if(countLikes>o.getCountLikes()) return +1;
        if(countLikes<o.getCountLikes()) return -1;
        return 0;
    }
}
