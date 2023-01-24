
public class ZAD21 {
    public static void main(String[] args) {
        Shape3D_21[] shape3D_21s = new Shape3D_21[2];
        shape3D_21s[0] = new Cone_21(3, 4);
        shape3D_21s[1] = new Qube_21(3);

        for (Shape3D_21 s:shape3D_21s){
            System.out.println(s.calculatePerimeter());
            System.out.println(s.calculateArea());
            System.out.println(s.calculateVolume());
        }
    }
}
