package nyc.c4q.simplemvp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BaseFragment extends Fragment implements Contractor.View{

    private EditText input;
    private Button submit;
    private TextView result;
    Contractor contractor;
    String userInput;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_base, container, false);

        input=view.findViewById(R.id.input);
        submit=view.findViewById(R.id.submit);
        result=view.findViewById(R.id.result);


        final CalculatePresenter presenter= new CalculatePresenter(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput=input.getText().toString();
                presenter.calculate(userInput);
            }
        });

        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                userInput=input.getText().toString();
                contractor.sendInput(userInput);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return view;
    }


    @Override
    public void setText(String input) {
        result.setText(input);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        contractor=(Contractor) context;
    }
}
