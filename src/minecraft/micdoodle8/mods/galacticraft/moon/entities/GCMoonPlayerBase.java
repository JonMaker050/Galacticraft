package micdoodle8.mods.galacticraft.moon.entities;

import micdoodle8.mods.galacticraft.moon.GalacticraftMoon;
import micdoodle8.mods.galacticraft.moon.blocks.GCMoonBlocks;
import micdoodle8.mods.galacticraft.moon.dimension.GCMoonWorldProvider;
import net.minecraft.src.ServerPlayerAPI;
import net.minecraft.src.ServerPlayerBase;
import net.minecraft.util.MathHelper;

public class GCMoonPlayerBase extends ServerPlayerBase
{
	private int lastStep;
	
	public GCMoonPlayerBase(ServerPlayerAPI var1) 
	{
		super(var1);
		GalacticraftMoon.moonPlayersServer.add(this);
	}
	
	@Override
	public void onUpdate()
	{
		final double j = Math.sqrt(player.motionX * player.motionX + player.motionZ * player.motionZ);
		
		if (this.player.worldObj != null && this.player.worldObj.provider instanceof GCMoonWorldProvider && !this.player.isAirBorne)
		{
			if (this.player.worldObj.getBlockId(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ)) == GCMoonBlocks.moonGrass.blockID)
			{
				if (this.player.worldObj.getBlockMetadata(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ)) == 0)
				{
					int meta = -1;
					
					final int i = 1 + MathHelper.floor_double((this.player.rotationYaw * 8.0F / 360.0F) + 0.5D) & 7;
					switch (this.lastStep)
					{
					case 1:
						switch (i)
						{
						case 0:
							meta = 2;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 1:
							meta = 4;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 2:
							meta = 2;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 3:
							meta = 2;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 4:
							meta = 2;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 5:
							meta = 2;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 6:
							meta = 2;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 7:
							meta = 2;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						}
						this.lastStep = 2;
						break;
					case 2:
						switch (i)
						{
						case 0:
							meta = 1;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 1:
							meta = 1;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 2:
							meta = 4;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 3:
							meta = 4;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 4:
							meta = 1;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 5:
							meta = 3;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 6:
							meta = 2;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						case 7:
							meta = 4;
							this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
							break;
						}
						this.lastStep = 1;
						this.player.worldObj.setBlockMetadataWithNotify(MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY - 1), MathHelper.floor_double(player.posZ), meta);
						break;
					default:
						this.lastStep = 1;
						break;
					}
				}
			}
		}
		
		super.onUpdate();
	}
}
