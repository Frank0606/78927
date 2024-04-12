using System;
using System.ServiceModel;

namespace icalculadora{
    [ServiceContract]
    public interface ICalculadora {
        public int suma(int a, int b);
        public int resta(int a, int b);
    }
}