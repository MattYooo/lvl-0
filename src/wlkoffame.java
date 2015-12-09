import org.teachingextensions.logo.Tortoise;

public class wlkoffame {
public static void main(String[]args){

	Tortoise.setSpeed(10);
	for(int θ=0; θ<1; θ--){
	for(int ψ=0; ψ<8; ψ++){
	Tortoise.turn(135);
	Tortoise.move(30);

}
Tortoise.turn(90);
Tortoise.penUp();
Tortoise.move(50);
Tortoise.penDown();
Tortoise.turn(-90);
}
}
}