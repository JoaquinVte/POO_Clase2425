package es.ieslavereda.ejemplos.estructuras_dinamicas.lse;

public class ListaSE {

    private int size;
    private Nodo head;


    public ListaSE(){
        size=0;
        head=null;
    }

    public void addHead(int num){

        Nodo n = new Nodo(num);

        if(head==null) {
            head = n;
        } else {
          n.next=head;
          head=n;
        }


        size++;
    }

    public Integer removeTail(){

        // Lista vacia
        if(head==null) return null;

        int info;

        // Solo 1 elemento
        if(head.next==null) {
            info = head.info;
            head=null;

        } else {   // 2 elementos o mas


            Nodo aux=head;

            while (aux.next.next!=null)
                aux=aux.next;

            info=aux.next.info;
            aux.next=null;

        }

        size--;
        return info;

    }

    public Integer removeHead(){

        if(head==null) return null;

        Nodo aux = head;

        head = head.next;

        size--;

        return aux.info;

    }

    public void addTail(int num){

        Nodo n = new Nodo(num);

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

    private class Nodo {

        private int info;
        private Nodo next;

        public Nodo(int info){
            this.info = info;
            this.next = null;
        }

    }
}
