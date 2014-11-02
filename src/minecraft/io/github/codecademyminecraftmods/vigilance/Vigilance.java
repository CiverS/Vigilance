package io.github.codecademyminecraftmods.vigilance;

import io.github.codecademyminecraftmods.vigilance.hacks.Fullbright;
import io.github.codecademyminecraftmods.vigilance.hacks.Regen;
import io.github.codecademyminecraftmods.vigilance.hacks.Xray;
import io.github.codecademyminecraftmods.vigilance.util.CheckKey;
import net.minecraft.client.Minecraft;

import org.lwjgl.input.Keyboard;

public class Vigilance {
	
	public static Minecraft minecraft = Minecraft.getMinecraft();
	public static CheckKey ck = new CheckKey(minecraft);
	
	public static Fullbright fullbright = new Fullbright(minecraft);
	public static Xray xray = new Xray(minecraft);
	public static Regen rgn = new Regen(minecraft);
	
	public static void checkForKeyPress() {
		if(ck.checkKey(Keyboard.KEY_F)) {
			fullbright.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_X)) {
			xray.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_R)) {
			rgn.turnOn();
		}
	}

}