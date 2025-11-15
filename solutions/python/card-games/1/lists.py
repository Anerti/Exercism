"""Functions for tracking poker hands and assorted card tasks.

Python list documentation: https://docs.python.org/3/tutorial/datastructures.html
"""
import math


def get_rounds(number):
    return [number, number + 1, number + 2]


def concatenate_rounds(rounds_1, rounds_2):
    return rounds_1 + rounds_2

def list_contains_round(rounds, number):
    return number in rounds


def card_average(hand):
    return sum(hand) / len(hand)


def approx_average_is_average(hand):
    average = sum(hand) / len(hand)
    return ((hand[len(hand) // 2] == average) or 
            (((hand[0] + hand[len(hand) - 1]) / 2) == average))


def average_even_is_average_odd(hand):
    even_index = hand[::2]
    odd_index = hand[1::2]
    return (sum(even_index) / len(even_index) == 
            sum(odd_index) / len(odd_index))


def maybe_double_last(hand):
    if hand[len(hand) - 1] == 11:
        hand = hand[:len(hand) - 1] + [22]
    return hand
