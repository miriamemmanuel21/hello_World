def calculate_population_growth(initial_population, growth_rate, years):
    population = initial_population
    growth_factor = 1 + growth_rate / 100

    print(f"{'Year':<10}{'Population':<20}{'Increase'}")
    print("-" * 40)

    for year in range(1, years + 1):
        population *= growth_factor
        increase = population - initial_population
        print(f"{year:<10}{int(population):<20}{int(increase)}")

    return population


initial_population = 8_000_000_000  
growth_rate = 0.91  


future_population = calculate_population_growth(initial_population, growth_rate, 100)


doubling_year = 100
while initial_population * 2 > future_population:
    future_population *= growth_factor
    doubling_year -= 1

quadrupling_year = 100
while initial_population * 4 > future_population:
    future_population *= growth_factor
    quadrupling_year -= 1

print("\nYears for population milestones:")
print(f"Population doubles by year {doubling_year}")
print(f"Population quadruples by year {quadrupling_year}")
