package es.ieslavereda.ejemplos.poo_avanzada.e5;

public class ListaSEString {

    private int size;
    private Nodo head;


    public ListaSEString(){
        size=0;
        head=null;
    }

    public void addHead(String num){

        Nodo n = new Nodo(num);

        if(head==null) {
            head = n;
        } else {
          n.next=head;
          head=n;
        }


        size++;
    }

    public String removeTail(){

        // Lista vacia
        if(head==null) return null;

        String info;

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

    public String removeHead(){

        if(head==null) return null;

        Nodo aux = head;

        head = head.next;

        size--;

        return aux.info;

    }

    public void addTail(String num){

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

    public boolean contains(String cliente) {

        Nodo aux = head;

//
//        while (aux!=null && !aux.info.equalsIgnoreCase(cliente))
//            aux=aux.next;
//
//
//        return aux!=null;

        boolean encontrado=false;

        while (aux!=null && !encontrado){
            encontrado = aux.info.equalsIgnoreCase(cliente);
            aux=aux.next;
        }
        return encontrado;

    }

    public void remove(String cliente) {

        if(head!=null){


            if(head.info.equalsIgnoreCase(cliente))
                removeHead();
            else if(head.next!=null){

                Nodo aux1 = head;
                Nodo aux2 = head.next;
                boolean encontrado=false;

                while (aux2!=null && !encontrado){

                    if(aux2.info.equalsIgnoreCase(cliente))
                        encontrado=true;
                    else{
                        aux1=aux2;
                        aux2=aux2.next;
                    }

                }

                if(encontrado){
                    aux1.next = aux2.next;
                }

            }
        }


    }

    private class Nodo {

        private String info;
        private Nodo next;

        public Nodo(String info){
            this.info = info;
            this.next = null;
        }

    }
}