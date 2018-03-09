package nyc.c4q.simplemvp;

/**
 * Created by yokilam on 3/8/18.
 */

public class CalculatePresenter implements Contractor.Presenter{
    private Contractor.View view;
    private Contractor contractor;

    public CalculatePresenter(Contractor.View view) {
        this.view = view;
    }

    @Override
    public void calculate(String input) {
        int intInput= Integer.parseInt(input);
        if (intInput < 10) {
            view.setText("Yes");
        } else {
            view.setText("No");
        }
    }
}
