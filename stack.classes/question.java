public class Question Extends Post{
    private final String title;
    private final set<Tag> tags;
    private final list<answer> answers = new ArrayList<>();
    private answer acceptedanswer;

    public Question(String title,String body, User author,Set<Tag> tags){
        super(UUID.randomUUID().toString(),body,author);
        this.title = title;
        this.tags = tags;
    }

    public void addAnswer(Answer answer){
        this.answers.add(answer);
    }
    public synchronized void acceptAnswer(Answer answer){
        if(!this.author.equals(answer.getAuthor().getId()) && this.acceptedAnswer == null){
            this.acceptedAnswer = answer;
            notifyObservers(new Event(EventType.ACCEPT_ANSWER, answer.getAuthor(),answer));
        }
    }
    public String getTitle(){
        return this.title;
    }
    public Set<Tag> getTags(){
        return this.tags;
    }
    public List<answer> getAnswer(){
        return this.answers;
    }
} 