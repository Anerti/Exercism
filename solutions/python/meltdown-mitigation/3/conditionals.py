def is_criticality_balanced(temperature, neutrons_emitted):
    return (temperature < 800 and 
            neutrons_emitted > 500 and 
            (neutrons_emitted * temperature) < 500000)


def reactor_efficiency(voltage, current, theoretical_max_power):
    efficiency = ((voltage * current) / theoretical_max_power) * 100
    
    if efficiency >= 80:
        return 'green'
    if 60 <= efficiency < 80:
        return 'orange'
    if 30 <= efficiency < 60:
        return 'red'
    else:
        return 'black'


def fail_safe(temperature, neutrons_produced_per_second , threshold):
    power_metric = temperature * neutrons_produced_per_second

    if power_metric < 0.9 * threshold:
        return 'LOW'
    elif 0.9 * threshold <= power_metric <= 1.1 * threshold:
        return 'NORMAL'
    else:
        return 'DANGER'
