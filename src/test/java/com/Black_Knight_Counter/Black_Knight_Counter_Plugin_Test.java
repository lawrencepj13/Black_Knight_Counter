package com.Black_Knight_Counter;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class Black_Knight_Counter_Plugin_Test
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(Black_Knight_Counter_Plugin.class);
		RuneLite.main(args);
	}
}