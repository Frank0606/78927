using System;
using System.ServiceModel;

//Definir varias clases con nombres iguales, pero que sean internamente diferentes
namespace WSDL.mensajes{
    [ServiceContract]
    public interface Mensajes {
        [OperationContract]
        string Saludar(string nombre);
        [OperationContract]
        string Mostrar(int id);
    }
}