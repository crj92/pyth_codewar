def likes(names):
    # your code here
    if len(names) == 0:
        print "'no one likes this'"
    elif len(names) == 1:
        print '\''+', '.join(names), "likes this'"
    elif len(names) <= 3:
        print '\''+', '.join(names), "like this'"
    else:
        print '\''+', '.join(names[0:2]), "and", int(len(names) - 2), "other like this'" 

        print names[0:2]
def main():
    print "inside main"
    
    list1 = []
    
    print "enter names or # to exit"
    for i in range(0, 999):
        list1.append(raw_input("Enter name: "));
        if list1[i] == '#':break
    list1.remove('#')
    likes(list1)
if __name__ == "__main__":
    main()

