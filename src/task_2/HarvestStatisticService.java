package task_2;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculate(Harvest[] harvests) {
        HarvestStatistic[] statistics = new HarvestStatistic[harvests.length];
        for (int i = 0; i < harvests.length; i++) {
            Harvest currentHarvest = harvests[i];

            for (int j = 0; j < statistics.length; j++) {
                HarvestStatistic harvestStatistics = statistics[j];

                if (harvestStatistics == null) {
                    statistics[j] = new HarvestStatistic(currentHarvest.getPlant(), currentHarvest.getWeight());
                    break;
                }
                if (harvestStatistics != null && harvestStatistics.getPlant().equals(currentHarvest.getPlant())) {
                    BigDecimal totalWeight = harvestStatistics.getTotalWeight().add(currentHarvest.getWeight());
                    harvestStatistics.setTotalWeight(totalWeight);
                    break;
                }
            }
        }
        return statistics;
    }
}






