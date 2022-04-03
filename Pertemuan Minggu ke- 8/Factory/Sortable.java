/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Factory;

/**
 *
 * @author Sasa
 */
interface Sortable{
    public int compare(Sortable b);
}
class Sort{
    public static void shell_sort( Sortable [ ] V )
    { //ordina in ordine crescente (o meglio: non decrescente)
        Sortable temp; //holding variable
        int j;
        boolean flag = true; // set flag to true to begin first pass
        while ( flag ){
            flag= false; //set flag to false awaiting a possible swap
            for( j=0; j < V.length -1; j++ ){
                if ( V[ j ].compare(V[j+1]) == 1 ){
                    temp = V[ j ]; //swap elements (we want ascending sort)
                    V[ j ] = V[ j+1 ];
                    V[ j+1 ] = temp;
                    flag = true; //shows a swap occurred
                }
            }
        }
    }
}

