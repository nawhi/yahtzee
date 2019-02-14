Yahtzee Kata
============

Inspired by Sandro Mancuso's [version](https://github.com/sandromancuso/yahtzee).

## General requirements

Build a playable console [Yahtzee](https://en.wikipedia.org/wiki/Yahtzee) application. It's worth reading about Yahtzee before you start if you are not very familiar with the game.  

## First round
 
The game should support 3 categories (Ones, Twos, and Threes). Player needs to roll the biggest number of 1s, 2s, and 3s
 for each category respectively.

The player will play categories in turn. The following is what you should see if you run the application:
 
	> Category: Ones
	> Dice: A:2 B:4 C:1 D:6 E:1
	> [1] Dice to re-run: 
    $ A B D
	> Dice: A:1 B:5 C:1 D:2 E:1 
	> [2] Dice to re-run: 
    $ B D
	> Dice: A:1 B:1 C:1 D:5 E:1
	> Category Ones score: 4
 	 
	> Category: Twos
	> Dice: A:2 B:4 C:1 D:6 E:1
	> ....
 	
	> Category: Threes
	> Dice: A:2 B:4 C:1 D:6 E:1
	> ....
 	
	> Yahtzee score
	> Ones: 4
	> Twos: [Total for Twos]
	> Threes: [Total for Threes]
	> Final score: [sum of the points in each category]

## Second round - requirement change

The player should roll the dice (up to three rolls) but only choose the most suitable category to add the points to
after finishing each turn. 

	> Dice: A:2 B:4 C:1 D:6 E:1
	> [1] Dice to re-run: 
    $ A B D
	> Dice: A:1 B:5 C:1 D:2 E:1 
	> [2] Dice to re-run: 
    $ B D
	> Dice: A:1 B:1 C:1 D:5 E:1

	> Available categories:
	> [1] Ones
	> [2] Twos
	> [3] Threes
	> Category to add points to: 1 
	> ....
 	
	> Dice: A:2 B:4 C:2 D:1 E:3
	> [1] Dice to re-run: 
    $ A B D
	> Dice: A:1 B:5 C:2 D:2 E:3 
	> [2] Dice to re-run: 
    $ A B E
	> Dice: A:2 B:4 C:2 D:2 E:5

	> Available categories:
	> [2] Twos
	> [3] Threes
	> Category to add points to: 2 
	> ....
	
	> Yahtzee score
	> Ones: 4
	> Twos: 6
	> Threes: [Total for Threes]
	> Final score: [sum of the points in each category]
	> 

Categories can be selected in any order. Categories can only be selected once.

## Third round - new requirement

Multi-player. Allow the game to interact with more than one player. Players should play in turns. 

	> [player 1] Dice: A:2 B:4 C:1 D:6 E:1
	> [player 1] [1] Dice to re-run: 
    $ A B D
	> [player 1] Dice: A:1 B:5 C:1 D:2 E:1 
	> [player 1] [2] Dice to re-run: 
    $ B D
	> [player 1] Dice: A:1 B:1 C:1 D:5 E:1
	
	> [player 1] Available categories:
	> [player 1] [1] Ones
	> [player 1] [2] Twos
	> [player 1] [3] Threes
	> [player 1] Category to add points to: 1 
	> ....
	
	> [player 2] Dice: A:2 B:4 C:2 D:1 E:3
	> [player 2] [1] Dice to re-run: 
    $ A B D
	> [player 2] Dice: A:1 B:5 C:2 D:2 E:3 
	> [player 2] [2] Dice to re-run: 
    $ A B E
	> [player 2] Dice: A:2 B:4 C:2 D:2 E:5
	
	> [player 2] Available categories:
	> [player 2] [1] Ones
	> [player 2] [2] Twos
	> [player 2] [3] Threes
	> [player 2] Category to add points to: 2 
	> ....
	
	> Yahtzee score for player 1
	> Ones: [Total for Ones]
	> Twos: [Total for Twos]
	> Threes: [Total for Threes]
	> Final score: [sum of the points in each category]
	> 
	
	> Yahtzee score for player 2
	> Ones: [Total for Ones]
	> Twos: [Total for Twos]
	> Threes: [Total for Threes]
	> Final score: [sum of the points in each category]
	> 
	> Winner: Player [N]

## Fourth round - new requirements

Implement all other missing [Yahtzee](https://en.wikipedia.org/wiki/Yahtzee) categories. 
