import java.util.Scanner;

public class GiftAdvisor {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		determineGift();
	}

	private static void determineGift()
	{
		String gender = getGender();
		String priceRange = getPriceRange();
		String ageRange = getAgeRange();
		String gift = recommendGift(gender, priceRange, ageRange);
		if(gift.equalsIgnoreCase("gift certificate"))
		{
			System.out.println("No ideas. Give " + gift);
		}
		else
		{
			System.out.println("Recommended gift(s): " + gift);
		}
	}

	private static String getGender()
	{
		System.out.print("Input recipient's gender: ");
		String gender = sc.next();
		return gender;
	}

	private static String getPriceRange()
	{
		System.out.print("Input giver\'s price range: ");
		String priceRange = sc.next();
		return priceRange;
	}

	private static String getAgeRange()
	{

		System.out.print("Input recipient's age range: ");
		String ageRange = sc.next();
		return ageRange;
	}

	private static String recommendGift(String gender, String priceRange, String ageRange)
	{
		String recommendedGift = "";
		if(gender.equalsIgnoreCase("male"))
		{
			if(priceRange.equalsIgnoreCase("low"))
			{
				if(ageRange.equalsIgnoreCase("adult"))
				{
					recommendedGift = "Books";
				}
				else if(ageRange.equalsIgnoreCase("teen"))
				{
					recommendedGift = "Shoes";
				}
				else if(ageRange.equalsIgnoreCase("child"))
				{
					recommendedGift = "SD Gunpla";
				}
				else
				{
					recommendedGift = "gift certificate";
				}
			}
			else if(priceRange.equalsIgnoreCase("medium"))
			{
				if(ageRange.equalsIgnoreCase("adult"))
				{
					recommendedGift = "Guitar";
				}
				else if(ageRange.equalsIgnoreCase("teen"))
				{
					recommendedGift = "Playstation";
				}
				else if(ageRange.equalsIgnoreCase("child"))
				{
					recommendedGift = "HG Gunpla";
				}
				else
				{
					recommendedGift = "gift certificate";
				}
			}
			else if(priceRange.equalsIgnoreCase("high"))
			{
				if(ageRange.equalsIgnoreCase("adult"))
				{
					recommendedGift = "Smart TV";
				}
				else if(ageRange.equalsIgnoreCase("teen"))
				{
					recommendedGift = "Apple Watch";
				}
				else if(ageRange.equalsIgnoreCase("child"))
				{
					recommendedGift = "MG Gunpla";
				}
				else
				{
					recommendedGift = "gift certificate";
				}
			}
			else
			{
				recommendedGift = "gift certificate";
			}
		}
		else if(gender.equalsIgnoreCase("female"))
		{
			if(priceRange.equalsIgnoreCase("low"))
			{
				if(ageRange.equalsIgnoreCase("adult"))
				{
					recommendedGift = "Wine";
				}
				else if(ageRange.equalsIgnoreCase("teen"))
				{
					recommendedGift = "Selfie Stick";
				}
				else if(ageRange.equalsIgnoreCase("child"))
				{
					recommendedGift = "Teddy Bear";
				}
				else
				{
					recommendedGift = "gift certificate";
				}
			}
			else if(priceRange.equalsIgnoreCase("medium"))
			{
				if(ageRange.equalsIgnoreCase("adult"))
				{
					recommendedGift = "Perfume";
				}
				else if(ageRange.equalsIgnoreCase("teen"))
				{
					recommendedGift = "Sweater";
				}
				else if(ageRange.equalsIgnoreCase("child"))
				{
					recommendedGift = "53\" Hugfun Bear";
				}
				else
				{
					recommendedGift = "gift certificate";
				}
			}
			else if(priceRange.equalsIgnoreCase("high"))
			{
				if(ageRange.equalsIgnoreCase("adult"))
				{
					recommendedGift = "Weekend Getaway";
				}
				else if(ageRange.equalsIgnoreCase("teen"))
				{
					recommendedGift = "Jewelry";
				}
				else if(ageRange.equalsIgnoreCase("child"))
				{
					recommendedGift = "93\" Hugfun Bear";
				}
				else
				{
					recommendedGift = "gift certificate";
				}
			}
			else
			{
				recommendedGift = "gift certificate";
			}
		}
		else
		{
			recommendedGift = "gift certificate";
		}
		return recommendedGift;
	}



}
