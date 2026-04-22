package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas{
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 2008);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 1920);
        meuFilme.avalia(5);
        Filme filmeDoPaulo = new Filme("Dogville", 1999);
        meuFilme.avalia(8);
        Serie lost = new Serie("lost", 2000);
        meuFilme.avalia(10);



        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }


        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ayrton sena");
        buscaPorArtista.add("Rock balboa");
        buscaPorArtista.add("David Goggins");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano:");
        System.out.println(lista);
    }
}

