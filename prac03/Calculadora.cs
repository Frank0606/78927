using System;
using icalculadora;

namespace calculadora{
    public interface Calculadora : ICalculadora{
        public int suma(int a, int b){
            return a+b;
        }
        public int resta(int a, int b){
            return a-b;
        }
    }
}