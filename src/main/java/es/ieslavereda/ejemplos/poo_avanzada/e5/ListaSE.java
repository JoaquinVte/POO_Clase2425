package es.ieslavereda.ejemplos.poo_avanzada.e5;

public class ListaSE<T> {

    private int size;
    private Nodo<T> head;


    public ListaSE(){
        size=0;
        head=null;
    }

    public void addHead(T num){

        Nodo<T> n = new Nodo<>(num);

        if(head==null) {
            head = n;
        } else {
          n.next=head;
          head=n;
        }


        size++;
    }

    public T removeTail(){

        // Lista vacia
        if(head==null) return null;

        T info;

        // Solo 1 elemento
        if(head.next==null) {
            info = head.info;
            head=null;

        } else {   // 2 elementos o mas


            Nodo<T> aux = head;

            while (aux.next.next!=null)
                aux=aux.next;

            info=aux.next.info;
            aux.next=null;

        }

        size--;
        return info;

    }

    public T removeHead(){

        if(head==null) return null;

        Nodo<T> aux = head;

        head = head.next;

        size--;

        return aux.info;

    }

    public void addTail(T num){

        Nodo<T> n = new Nodo(num);

        if(head==null) {
            head = n;
        } else {

            Nodo aux=head;
            while (aux.next!=null)
                aux = aux.next;

            aux.next=n;

        }

        size++;

    }


    @Override
    public String toString() {
        String text = "Size: " + size +"\n"+
                    "Nodo: ";
        Nodo aux = head;

        while(aux!=null){

            text+=aux.info+ " ";
            aux = aux.next;

        }

        return text;
    }

    private class Nodo<T> {

        private T info;
        private Nodo<T> next;

        public Nodo(T info){
            this.info = info;
            this.next = null;
        }

    }
}
