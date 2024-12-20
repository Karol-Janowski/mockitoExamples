package pl.zajavka.examples;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CapacityCalculationServiceImpl implements CapacityCalculationService{
    private final WidthCalculationService widthCalculationService;
    private final HeightCalculationService heightCalculationService;
    private final DepthCalculationService depthCalculationService;

    @Override
    public BigDecimal someCalculation(final InputData inputdata) {
        BigDecimal height = heightCalculationService.calculate(inputdata);
        BigDecimal width = widthCalculationService.calculate(inputdata);
        BigDecimal decimal = depthCalculationService.calculate(inputdata);
        return height.multiply(width).multiply(decimal);
    }
}
