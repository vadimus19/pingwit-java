package task_2;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculate(Harvest[] harvests) {
        HarvestStatistic[] statistics = new HarvestStatistic[harvests.length];
        for (int i = 0; i < harvests.length; i++) {
            Harvest currentHarvest = harvests[i];

            for (int j = 0; j < statistics.length; j++) {
                HarvestStatistic harvestStatistic = statistics[j];

                if (harvestStatistic == null) {
                    statistics[j] = new HarvestStatistic(currentHarvest.getPlant(), currentHarvest.getWeight());
                    break;
                }
                if (harvestStatistic != null && harvestStatistic.getPlant().equals(currentHarvest.getPlant())) {
                    BigDecimal totalWeight = harvestStatistic.getTotalWeight().add(currentHarvest.getWeight());
                    harvestStatistic.setTotalWeight(totalWeight);
                    break;
                }
            }
        }
        return statistics;
    }
}






