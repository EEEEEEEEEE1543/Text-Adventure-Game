public class Question {
    String answer;
    String question;
    public Question(String answer, String question, String correctText, String incorrectText){
        this.answer = answer;
        this.question = question; 
    }
    public boolean isCorrect(String input){
       return answer.equals(input);
    }
}
