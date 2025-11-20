
def exchange_money(budget, exchange_rate):
    return budget / exchange_rate

def get_change(budget, exchanging_value):
    return float(budget - exchanging_value)

def get_value_of_bills(denomination, number_of_bills):
    return number_of_bills * denomination

def get_number_of_bills(amount, denomination):
    return amount // denomination

def get_leftover_of_bills(amount, denomination):
    return amount % denomination

def exchangeable_value(budget, exchange_rate, spread, denomination):
    effective_rate = exchange_rate * (1 + spread / 100)
    total_foreign = budget / effective_rate
    whole_units = int(total_foreign // denomination) * denomination

    return whole_units
