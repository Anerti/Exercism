<?php

class PizzaPi
{
    public function calculateDoughRequirement(int $pizzas, int $persons): int
    {
        return ($pizzas * (($persons * 20) + 200));
    }

    public function calculateSauceRequirement(int $pizzas, int $canQuantity): int
    {
        return (($pizzas * 125) / $canQuantity);
    }

    public function calculateCheeseCubeCoverage(int $sideLength, float $thickness, int $diameter): int
    {
        return ($sideLength ** 3) / ($thickness * pi() * $diameter);
    }

    public function calculateLeftOverSlices(int $pizzas, int $persons): int
    {
        return ($pizzas * 8) % $persons;
    }
}
