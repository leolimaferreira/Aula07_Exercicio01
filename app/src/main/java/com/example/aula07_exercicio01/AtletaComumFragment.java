/*
 *@author:<Leonardo Lima 1110482423021>
 */
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
import com.example.aula07_exercicio01.controller.OperacaoAC;
import com.example.aula07_exercicio01.model.AtletaComum;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class AtletaComumFragment extends Fragment {

    private View view;
    private EditText etNomeAC;
    private EditText etDataAC;
    private EditText etBairroAC;
    private EditText etAcademiaAC;
    private EditText etRecordeAC;
    private Button btnCadastrarAC;
    private TextView tvListaAC;

    public AtletaComumFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_comum, container, false);
        etNomeAC = view.findViewById(R.id.etNomeAC);
        etDataAC = view.findViewById(R.id.etDataAC);
        etBairroAC = view.findViewById(R.id.etBairroAC);
        etAcademiaAC = view.findViewById(R.id.etAcademiaAC);
        etRecordeAC = view.findViewById(R.id.etRecordeAC);
        btnCadastrarAC = view.findViewById(R.id.btnCadastrarAC);
        tvListaAC = view.findViewById(R.id.tvListaAC);
        tvListaAC.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        
        btnCadastrarAC.setOnClickListener(op -> cadastro());

        return view;
    }

    private void cadastro() {
        AtletaComum ac = new AtletaComum();
        ac.setNome(etNomeAC.getText().toString());
        ac.setDataNasc(etDataAC.getText().toString());
        ac.setBairro(etBairroAC.getText().toString());
        ac.setAcademia(etAcademiaAC.getText().toString());
        ac.setSegundos(Double.parseDouble(etRecordeAC.getText().toString()));

        IOperacao<AtletaComum> op = new OperacaoAC();
        op.cadastrar(ac);
        List<AtletaComum> lista = op.listar();

        StringBuffer buffer = new StringBuffer();
        for(AtletaComum a : lista) {
            buffer.append(a.toString() + "\n");
        }
        tvListaAC.setText(buffer.toString());
        Toast.makeText(view.getContext(), ac.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeAC.setText("");
        etDataAC.setText("");
        etBairroAC.setText("");
        etAcademiaAC.setText("");
        etRecordeAC.setText("");
    }
}