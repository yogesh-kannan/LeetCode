class Solution {
public:
    ListNode* sortList(ListNode* head) {
        vector<int> nigga;
        ListNode* temp = head;
        while(temp!=nullptr){
            nigga.push_back(temp->val);
            temp = temp->next;
        }
        sort(nigga.begin(),nigga.end());
        temp=head;
        for(int i=0;i<nigga.size();i++){
            temp->val = nigga[i];
            temp=temp->next;
        }
        return head;
    }
};
