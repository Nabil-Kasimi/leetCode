
#include <stdio.h>
#include <stdlib.h>

// struct ListNode {
//   int val;
//   struct ListNode *next;
// };

struct ListNode* new_node(int content)
{
  struct ListNode *node;
  node = malloc(sizeof(struct ListNode));
  if(!node)
    return NULL;
  node->val = content;
  node->next = NULL;
  return node;
}

void add_node(struct ListNode** list, struct ListNode*node)
{
  struct ListNode *ptr;

  if(!list || !node)
    return;
  if(!*list)
  {
    *list = node;
    return;
  }
  ptr= *list;
  while(ptr->next != NULL)
  {
    ptr = ptr->next;
  }
  ptr->next = node;
}

void add_to_list(struct ListNode** list, int content)
{
  add_node(list,  new_node(content));
}

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2)
{

  struct ListNode *result;

  result = NULL;

  if(!list1 && list2)
    return list2;
  if(list1 && !list2)
    return list1;
  struct  ListNode* ptr1 = list1;
  struct  ListNode* ptr2 = list2;
  while(ptr1 && ptr2)
  {
    if(ptr1->val <= ptr2 ->val)
    {
      add_to_list(&result, ptr1->val);
      ptr1 = ptr1->next;
    }
    else{
      add_to_list(&result, ptr2->val);
      ptr2 = ptr2->next;
    }
  }

  while(ptr2)
  {
  add_to_list(&result, ptr2->val);
    ptr2 = ptr2->next;
  }

  while(ptr1)
  {
  add_to_list(&result, ptr1->val);
    ptr1 = ptr1->next;
  }
  return result;
}
