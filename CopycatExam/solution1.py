s=input()
s1=input()
s=s.lower()
s=sorted(s)
s1=s1.lower()
s1=sorted(s1)
if s1==s:
    print(1)
else:
    print(0)