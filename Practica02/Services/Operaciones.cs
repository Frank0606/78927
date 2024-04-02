using System;
using WSDL.mensajes;

namespace WSDL.operaciones{
    public class Operaciones : Mensajes {
        public List<string> Nombres = [];
        public string Saludar(string nombre){
            string msj = "Hola " + nombre;
            Nombres.Add(nombre);
            return msj;
        }
        public string Mostrar(int id){
            string nombre = Nombres[id];
            return nombre;
        }
    }
}