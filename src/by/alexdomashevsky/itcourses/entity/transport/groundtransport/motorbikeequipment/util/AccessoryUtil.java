package by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment.util;

import by.alexdomashevsky.itcourses.entity.transport.groundtransport.MotorBike;
import by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment.Accessory;
import by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment.Helmet;
import by.alexdomashevsky.itcourses.entity.transport.groundtransport.motorbikeequipment.Visor;

public class AccessoryUtil {
//	как реализовать с классами родителей??
	public static void addAccessory(Helmet helmet, Visor visor) {
		helmet.setVisor(visor);
	}
	
	public static void addAccessory(MotorBike moto, Accessory accessory) {
		Accessory[] acc = moto.getAccessory();
		if(acc==null) {
			acc = new Accessory[] {accessory};
			moto.setAccessory(acc);
		}else {
			Accessory[] tmp = new Accessory[acc.length+1];
			for (int i = 0; i < acc.length; i++) {
				tmp[i] = acc[i];
			}
			tmp[tmp.length-1]=accessory;
			moto.setAccessory(tmp);
		}
	}
}
