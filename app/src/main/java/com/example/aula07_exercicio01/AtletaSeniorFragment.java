package com.example.aula07_exercicio01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aula07_exercicio01.controller.IOperacao;
import com.example.aula07_exercicio01.controller.OperacaoAJ;
import com.example.aula07_exercicio01.controller.OperacaoAS;
import com.example.aula07_exercicio01.model.AtletaJuvenil;
import com.example.aula07_exercicio01.model.AtletaSenior;

import java.util.List;

public class AtletaSeniorFragment extends Fragment {

    private View view;
    private EditText etNomeAS;
    private EditText etDataAS;
    private EditText etBairroAS;
    private EditText etProblemaAS;
    private Button btnCadastrarAS;
    private TextView tvListaAS;
    
    public AtletaSeniorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_senior, container, false);
        etNomeAS = view.findViewById(R.id.etNomeAS);
        etDataAS = view.findViewById(R.id.etDataAS);
        etBairroAS = view.findViewById(R.id.etBairroAS);
        etProblemaAS = view.findViewById(R.id.etProblemaAS);
        btnCadastrarAS = view.findViewById(R.id.btnCadastrarAS);
        tvListaAS = view.findViewById(R.id.tvListaAS);
        tvListaAS.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCadastrarAS.setOnClickListener(op -> cadastro());

        return view;
    }

    private void cadastro() {
        AtletaSenior as = new AtletaSenior();
        as.setNome(etNomeAS.getText().toString());
        as.setDataNasc(etDataAS.getText().toString());
        as.setBairro(etBairroAS.getText().toString());
        as.setProblemaCardiaco(etProblemaAS.getText().toString());
        

        IOperacao<AtletaSenior> op = new OperacaoAS();
        op.cadastrar(as);
        List<AtletaSenior> lista = op.listar();

        StringBuffer buffer = new StringBuffer();
        for(AtletaSenior a : lista) {
            buffer.append(a.toString() + "\n");
        }
        tvListaAS.setText(buffer.toString());
        Toast.makeText(view.getContext(), as.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeAS.setText("");
        etDataAS.setText("");
        etBairroAS.setText("");
        etProblemaAS.setText("");
    }
}