package task_2;

import java.math.BigDecimal;

public class HarvestMain {
    public static void main(String[] args) {
        Harvest[] harvests = new Harvest[3];
        Harvest rice = new Harvest(1l, "field", "rice", new BigDecimal(10));
        harvests[0] = new Harvest(1l, "field", "rice", new BigDecimal(10));
        harvests[1] = new Harvest(2l, "field2", "millet", new BigDecimal(9));
        harvests[2] = new Harvest(3l, "field3", "rape", new BigDecimal(8));

        HarvestStatisticService statisticService = new HarvestStatisticService();
        HarvestStatistic[] result = statisticService.calculate(harvests);
    }
}
