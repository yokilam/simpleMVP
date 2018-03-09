package nyc.c4q.simplemvp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    private TextView userInput;
    private String userInputFromAnotherFragment="";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_second, container, false);
        userInput= view.findViewById(R.id.input_from_edittext);
//        userInput.setText(userInputFromAnotherFragment);
        return view;
    }

    public void receiveUserInput(String input){
        Log.d("receiveUserInput: ", "" + input);
        userInput.setText(input);
//        userInputFromAnotherFragment=input;
    }

}
