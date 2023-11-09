package java1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Tests_HomerSimpson {
		
		Tests_HomerSimpson homersimpson = new Tests_HomerSimpson();
		
		@Test
		public void Duff() {
			//fail("Not yet implemented");
			homersimpson.drinkBeer().contains("duff");
		}

		private String drinkBeer() {
			// TODO Auto-generated method stub
			return null;
		}

		@Test
		public void Donuts() {
			//fail("Not yet implemented");
			homersimpson.eatDonuts().contains("donuts");
		}
		
		public void DuffBis() {
			assertEquals("duff", Tests_HomerSimpson.drinkBeer(String.valueOf("duff")));
			}

	}
