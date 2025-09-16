import itertools
import string
import threading

def brute_force_segment(password, characters, results):
    for length in range(1, len(password) + 1):
        for guess in itertools.product(characters, repeat=length):
            guess = ''.join(guess)
            if guess == password:
                results.append(guess)
                return

if __name__ == "__main__":
    password_to_crack = input("Masukkan kata sandi yang ingin ditebak: ")
    characters = string.ascii_lowercase  # Batasi set karakter
    results = []
    
    threads = []
    for i in range(4):  # Misalnya, menggunakan 4 thread
        thread = threading.Thread(target=brute_force_segment, args=(password_to_crack, characters, results))
        threads.append(thread)
        thread.start()

    for thread in threads:
        thread.join()  # Tunggu semua thread selesai

    if results:
        print(f"Kata sandi ditemukan: {results[0]}")
    else:
        print("Kata sandi tidak ditemukan.") 