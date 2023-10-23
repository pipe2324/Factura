public class testing {

    public double calculartotalneto(int cantidad, double costounitario) {
        return cantidad * costounitario;
    }

    public double calcularTotalConImpuestos(double totalNeto) {
            int iva = 19;
            return totalNeto + calcularIva(totalNeto, iva);
        }

        public double calcularIva(double totalNeto, int iva) {
            return totalNeto * iva / 100.0;
        }
    }

