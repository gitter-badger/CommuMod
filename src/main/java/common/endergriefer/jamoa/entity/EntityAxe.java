package common.endergriefer.jamoa.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

/**
 * Created by noah on 6/13/14.
 */
public class EntityAxe extends EntityThrowable {
    public EntityAxe(World world, double par2, double par4, double par6)
    {
        super(world, par2, par4, par6);
    }
    public EntityAxe(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }
    public EntityAxe(World par1World)
    {
        super(par1World);
    }

    @Override
    protected void onImpact(MovingObjectPosition mop)
    {
        //If this hit's a block, continue
        if(mop.typeOfHit == MovingObjectType.BLOCK)
        {
/*
* You might be wondering what
* all these case and break are
* These are use to switch the number
* mop.sideHit
*
* Example:
* If mop.sideHit == 3 whatever is in
* case 3 Happens!
*/
            switch(mop.sideHit)
            {
                case 0: //BOTTOM
                    mop.blockY--;
                    break;
                case 1: //TOP
                    mop.blockY++;
                    break;
                case 2: //EAST
                    mop.blockZ--;
                    break;
                case 3: //WEST
                    mop.blockZ++;
                    break;
                case 4: //NORTH
                    mop.blockX--;
                    break;
                case 5: //SOUTH
                    mop.blockX++;
                    break;
            }
/* This method creates the explosion!
* It uses the entity (Can be null)
* the three coordinates, the strength
* and if it should spawn smoke particles
* around after exploding, the last parameter
* is if it should set neighboring blocks on fire
*/
            this.worldObj.newExplosion(this, mop.blockX, mop.blockY, mop.blockZ, 4.0F, true, false);
        }
//If the Server is online and works, kill this entity
        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
        System.out.println("Entity landed!");
    }
}
