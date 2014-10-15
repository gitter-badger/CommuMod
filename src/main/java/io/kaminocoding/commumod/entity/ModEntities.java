package io.kaminocoding.commumod.entity;

import io.kaminocoding.commumod.help.RegisterHelper;

/**
 * Created by noah on 10/12/14.
 */
public class ModEntities {
    public static void init()
    {
        RegisterHelper.registerEntity(EntityMiner.class, "miner");
        RegisterHelper.registerEntity(EntitySuperbiumGolem.class, "superbiumGolem");
        RegisterHelper.registerEntity(EntityAradactiteGolem.class, "aradactiteGolem");
    }
}
