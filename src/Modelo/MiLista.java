package Modelo;

public class MiLista {

    Nodo MiNodo;

    public MiLista() {
        MiNodo = null;
    }

    //Constructor
    public MiLista(double x) {
        MiNodo.valor = x;
        MiNodo.link = null;
    }

    //Polimorfismo en agregar un nodo en la lista ya sea de camareros,mesas,pedidos..
    //Agregar objeto camarero a la lista de camareros en restaurante
    public void add(Camarero x) {
        Nodo n = new Nodo(x);
        n.link = MiNodo;
        MiNodo = n;
    }

    //Agregar objeto mesa a la lista de mesas en restaurante/camarero
    public void add(Mesa x) {
        Nodo n = new Nodo(x);
        n.link = MiNodo;
        MiNodo = n;
    }

    //Agregar string pedido y double precio a la lista de pedidos en mesa
    public void add(String x, double valor) {
        Nodo n = new Nodo(x, valor);
        n.link = MiNodo;
        MiNodo = n;
    }

    void add(Alimento x) {
        Nodo n = new Nodo(x);
        n.link = MiNodo;
        MiNodo = n;
    }

    //retorna el tamaño de la lista
    public int size() {
        int cont = 0;
        Nodo curr = MiNodo;
        while (curr != null) {
            cont++;
            curr = curr.link;
        }
        return cont;
    }

    //retorna si esta vacia o no
    public boolean isEmpty() {
        if (MiNodo == null) {
            return true;
        } else {
            return false;
        }
    }

//retorna true o false si contiene un elemento
    public boolean Contiene(int x) {
        Nodo actual = MiNodo;
        while (actual != null) {

            System.out.println(actual.me.getId());
            if (actual.me.getId() == x) {
                return true;
            }
            actual = actual.link;
        }
        return false;
    }

    public Camarero getCamarero(int id) {
        Nodo actual = MiNodo;
        while (actual != null) {
            if (actual.ca.getId() == id) {
                return actual.ca;
            }
            actual = actual.link;
        }
        return null;
    }

    public String getPedidoYPrecio(int i) {
        String pedido = "";
        Nodo actual = MiNodo;
        int cont = 0;
        while (cont < i && actual.link != null) {
            cont = cont + 1;
            actual = actual.link;
        }
        if (cont == i) {
            pedido = "PEDIDO: " + actual.ped + "    PRECIO: " + actual.valor;
        }

        return pedido;

    }

    public String getPedidos() {
        String pedido = "";
        Nodo actual = MiNodo;
        Boolean flag = true;
        while (actual != null) {
            if (flag == true) {
                pedido = actual.ped;
                flag = false;
            } else {
                pedido = pedido + "," + actual.ped;
            }
            actual = actual.link;
        }
        return pedido;

    }

    public Mesa RetornarMesa(int x) {
        Nodo actual = MiNodo;
        while (actual != null) {
            if (actual.me.getId() == x) {
                return actual.me;
            }
            actual = actual.link;
        }
        return null;
    }

    
    //Polimorfismo en retornarAlimento
    public Alimento RetornarAlimento(int x) {
        Nodo actual = MiNodo;
        while (actual != null) {
            if (actual.al.getId() == x) {
                return actual.al;
            }
            actual = actual.link;
        }
        return null;
    }

    public Alimento RetornarAlimento(String x) {
        Nodo actual = MiNodo;
        while (actual != null) {
            if (actual.al.getNombre().equals(x)) {
                return actual.al;
            }
            actual = actual.link;
        }
        return null;
    }

    public double getNumero(double x) {
        Nodo actual = MiNodo;
        while (actual != null) {
            if (actual.valor == x) {
                return actual.valor;
            }
            System.out.println(actual.valor);
            actual = actual.link;
        }
        return 0;
    }

    public void Eliminar(int x) {
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo ant = MiNodo;
        if (Contiene(x)) {
            if (ant.me.getId() == x) { //Si el primer elemento contiene a x
                MiNodo = ant.link;
                ant.link = null;
            } else if (ant.me.getId() != x) {
                Nodo actual = MiNodo.link;
                while (actual.me.getId() != x) {//Recorre la lista hasta encontrar x
                    actual = actual.link;
                    ant = ant.link;
                }//Elimina a x
                ant.link = actual.link;
                actual.link = null;
            }
            System.out.println("asi es");
        } else //la lista no contiene el elemento
        {
            System.out.println("La lista no contiene: " + x);
        }

    }

}
