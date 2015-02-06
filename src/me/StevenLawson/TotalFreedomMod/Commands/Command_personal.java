case "xTyph":
TFM_Util.bcastMsg("Incoming Burning Destruction!", ChatColor.RED);
for (World world : Bukkit.getWorlds())
{
for (Entity entity : world.getEntities())
{
if(entity instanceof LivingEntity && !(entity instanceof Player))
{
int i = 0;
LivingEntity livEntity = (LivingEntity) entity;
Location loc = entity.getLocation();
do
{
world.strikeLightningEffect(loc);
i++;
}
while (i <= 2);
livEntity.setHealth(0);
}
}
for (final Player player : server.getOnlinePlayers())
{
for (double percent = 0.0; percent <= 1.0; percent += (1.0 / STEPS))
{
final float pitch = (float) (percent * 2.0);
new BukkitRunnable()
{
@Override
public void run()
{
player.playSound(randomOffset(player.getLocation(), 5.0), Sound.values()[random.nextInt(Sound.values().length)], 100.0f, pitch);
}
}.runTaskLater(plugin, Math.round(20.0 * percent * 2.0));
}
}
}
break;
