package hawox.uquest;

public class UQuestConfig {

	//config file defaults
	private boolean hideQuestRewards = false;
	private boolean scaleQuestLevels = true;
	private boolean broadcastSaving = true;
//	private boolean useiConomy = true;
	private boolean usePermissions = true;
	private boolean useSQLite = false;
	private boolean useDefaultUQuest = true;
//	private boolean useBOSEconomy = false;
//	private boolean useEssentials = false;
	private int SaveQuestersInfoIntervalInMinutes = 30;
	private int questAnnounceInterval = 5;
	private int questRewardInterval = 10;
	private int questLevelInterval = 50;
	private int dropQuestInterval = 60;
	private int dropQuestCharge = 5000;
    private String moneyName = "Monies";
//    private int pluginTimerCheck = 5;
    private String questRewardsDefault = "87,Netherrack Blocks,10~88,Soul Sand Blocks,10~89,Glowstone Blocks,10~18,Leaf Blocks,10~344,Eggs,10~348,Glowstone Dust,10";
	private String[] questRewards = { "87,Netherrack Blocks,10",
			  "88,Soul Sand Blocks,10",
			  "89,Glowstone Blocks,10",
			  "18,Leaf Blocks,10",
			  "344,Eggs,10"};
}
