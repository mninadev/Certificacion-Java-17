package joedayz.java17.design.clases.avanzado.enums;

public enum Season2 {
    //En este caso no se declara el metodo abstract, porque ya no es abstracto.
    WINTER{
        public String getHours(){
            return "10am - 3pm";
        }
    },
    SUMMER{
        public String getHours(){
            return "10am - 3pm";
        }
    },
    SPRING, FALL{ //También se puede utilizar de esta forma
        public String getHours(){
            return "10am - 3pm";
        }
    }
}
