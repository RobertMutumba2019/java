import phonenumbers
from phonenumbers import geocoder

# Replace the number with your phone number as a string
phone_number = "+256777053149"

# Parse the phone number
parsed_number = phonenumbers.parse(phone_number)

# Get the country/location
country = geocoder.description_for_number(parsed_number, "en")

print("\nPhone Number Location")
print(country)
