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
import com.example.aula07_exercicio01.controller.OperacaoAJ;
import com.example.aula07_exercicio01.model.AtletaComum;
import com.example.aula07_exercicio01.model.AtletaJuvenil;

import java.util.List;

public class AtletaJuvenilFragment extends Fragment {

    private View view;
    private EditText etNomeAJ;
    private EditText etDataAJ;
    private EditText etBairroAJ;
    private EditText etAnosAJ;
    private Button btnCadastrarAJ;
    private TextView tvListaAJ;

    public AtletaJuvenilFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_juvenil, container, false);
        etNomeAJ = view.findViewById(R.id.etNomeAJ);
        etDataAJ = view.findViewById(R.id.etDataAJ);
        etBairroAJ = view.findViewById(R.id.etBairroAJ);
        etAnosAJ = view.findViewById(R.id.etAnosAJ);
        btnCadastrarAJ = view.findViewById(R.id.btnCadastrarAJ);
        tvListaAJ = view.findViewById(R.id.tvListaAJ);
        tvListaAJ.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCadastrarAJ.setOnClickListener(op -> cadastro());

        return view;
    }

    private void cadastro() {
        AtletaJuvenil aj = new AtletaJuvenil();
        aj.setNome(etNomeAJ.getText().toString());
        aj.setDataNasc(etDataAJ.getText().toString());
        aj.setBairro(etBairroAJ.getText().toString());
        aj.setQtdAnos(Integer.parseInt(etAnosAJ.getText().toString()));

        IOperacao<AtletaJuvenil> op = new OperacaoAJ();
        op.cadastrar(aj);
        List<AtletaJuvenil> lista = op.listar();

        StringBuilder buffer = new StringBuilder();
        for(AtletaJuvenil a : lista) {
            buffer.append(a.toString() + "\n");
        }
        tvListaAJ.setText(buffer.toString());
        Toast.makeText(view.getContext(), aj.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeAJ.setText("");
        etDataAJ.setText("");
        etBairroAJ.setText("");
        etAnosAJ.setText("");
    }
}