package org.cc16;

/**
 * Created by jonathan on 5/24/17.
 */

import java.util.ArrayList;
import java.util.

public class Tabela {
    private String titulo;
    private ArrayList<ListaEncadeada> linhas;
    private ArrayList<String> cabecalho;

    public Tabela(){

    }

    public getSomatorioLinha(int linha){
        linhas[linha].getSomatorio();
    }
}
