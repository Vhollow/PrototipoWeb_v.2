package pac;


/**
 *
 * @author Vicente
 */
import java.io.Serializable;
public class Noticias implements Serializable{
    public Noticias(){
        
    }
    public String[] getTitN4(){
        String[] a=new String[4];
        a[0]="Basta de maltrato en las granjas de animales";
        a[1]="Vida emocional animales de granja";
        a[2]="Basta de maltrato en las granjas de animales";
        a[3]="Vida emocional animales de granja";
        return a;
    }
    public String[] getTexN4(){
        String[] a=new String[4];
        a[0]="Basta de maltrato en las granjas de animales";
        a[1]="Vida emocional animales de granja";
        a[2]="Basta de maltrato en las granjas de animales";
        a[3]="Vida emocional animales de granja";
        return a;
    }
    public String[] getImgN4(){
        String[] a=new String[4];
        a[0]="Imagenes/granja.jpg";
        a[1]="Imagenes/vaca_cerdo_pollo.jpg";
        a[2]="Imagenes/granja.jpg";
        a[3]="Imagenes/vaca_cerdo_pollo.jpg";
        return a;
    }
    public String[] getUrlN4(){
        String[] a=new String[4];
        a[0]="Noticias/noticia-basta-maltrato-granjas.html";
        a[1]="Noticias/noticia-vida-emocional-animales-granja.html";
        a[2]="Noticias/noticia-basta-maltrato-granjas.html";
        a[3]="Noticias/noticia-vida-emocional-animales-granja.html";
        return a;
    }
     public String getTitle(){
        return "Basta de maltrato en las granjas de animales";
    }
    public String getImage(){
        return "Imagenes/vaca_cerdo_pollo.jpg";
    }
    public String getTexto(){
        return "<p>\n" +
"                    Si alguien le hiciera a un perro o a un gato lo que la ganadería industrial\n" +
"                    hace a los animales de granja, acabaría en la cárcel. La diferencia es que los \n" +
"                    animales víctimas de la ganadería industrial son cerdos, \n" +
"                    vacas, terneras, pollos y gallinas, entre  otros.  \n" +
"                \n" +
"                </p>\n" +
"                \n" +
"\n" +
"                <p>Por desgracia para estos animales sensibles, inteligentes y con tantas ganas de vivir como nuestros amados\n" +
"                    perros y gatos, ellos están en manos de las industrias cárnica, láctea y del huevo. Posiblemente,las industrias\n" +
"                    responsables del mayor maltrato animal de la historia del ser humano.</p>\n" +
"\n" +
"                <p>    La protección legal de la que gozan nuestros perros y gatos no se aplica en granjas y mataderos. En ellos, la \n" +
"                    ley vigente apenas consigue reducir el sufrimiento inhumano del confinamiento, las enfermedades asociadas a \n" +
"                    las condiciones de vida extremas o la crueldad de la utilización de las madres como «máquinas de parir».</p>\n" +
"\n" +
"                <p>    Pero hablemos de números. La ganadería industrial envía al matadero cada año a 60.000 millones de pollos,\n" +
"                    2.800 millones de patos, 1.300 millones de cerdos o 517 millones de corderos, entre otros. En total, cada \n" +
"                    año los mataderos del mundo sacrifican a un número de animales equivalente a ocho veces la población de \n" +
"                    seres humanos del planeta.</p>\n" +
"\n" +
"                    <p>La práctica totalidad de carne, huevos y leche que son consumidos provienen de este tipo de ganadería industrial.</p>\n" +
"\n" +
"                    <p>La vida para estos animales no es fácil, en una granja industrial se producen prácticas desconocidas por la \n" +
"                    mayoría de consumidores. Las industrias que procesan a los animales mantienen políticas opacas respecto a sus \n" +
"                    métodos de producción. En su publicidad nos muestran a animales de granja en situaciones idílicas, pero la \n" +
"                    realidad es bien distinta.</p>\n" +
"\n" +
"                    <p>Es la consecuencia de tener que criar y sacrificar a millones y millones de animales. La crueldad campea a \n" +
"                    sus anchas. Algunas de estas prácticas incluyen inseminar artificialmente a las madres una y otra vez, para que, \n" +
"                    una vez nacidos, sus pequeños les sean arrebatados para criarlos en las granjas de engorde.</p>\n" +
"\n" +
"                    <p> Por su lado, todos los pollitos macho de la industria del huevo son descartados y eliminados brutalmente con \n" +
"                    salvajes métodos como ser triturados vivos (al no ser viable su crianza para ser convertidos en carne son \n" +
"                    considerados un subproducto si uso práctico).</p>\n" +
"\n" +
"\n" +
"\n" +
"                    <p>Ninguno de nosotros podemos imaginar que semejante maltrato pudiera cometerse con nuestros amigos los perros\n" +
"                     y los gatos. Sin embargo, muy cerca de nosotros, la perfectamente engrasada maquinaria de la ganadería \n" +
"                    industrial perpetra los más terribles abusos sobre animales indefensos y desprotegidos por la ley.</p>\n" +
"\n" +
"                    <p>Para los animales de granja no hay caricias ni atenciones, su destino está marcado desde su nacimiento: acabar \n" +
"                    convertidos en bandejas de carne en los supermercados.</p>";
    }
}
