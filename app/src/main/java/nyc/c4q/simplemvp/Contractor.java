package nyc.c4q.simplemvp;

/**
 * Created by yokilam on 3/8/18.
 */

public interface Contractor {
    void sendInput(String userInput);
    void sendResult(String result);

    public interface View{
        void setText(String result);
    }

    public interface Presenter{
        void calculate(String input);
    }
}
