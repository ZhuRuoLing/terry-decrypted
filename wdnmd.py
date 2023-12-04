
iden = "SEROXEN"
def extract():
    with open("bytes.bat", "r") as f:
        for line in f:
            if line.startswith(iden):
                with open("src.txt","w+") as w:
                    w.write(line)
                    w.flush



