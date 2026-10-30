<?php

class HighSchoolSweetheart
{
    public function firstLetter(string $name): string
    {
        return substr(trim($name), 0, 1);
    }

    public function initial(string $name): string
    {
        return strtoupper($this->firstLetter($name)) . ".";
    }

    public function initials(string $name): string
    {
        $table = explode(' ', $name);
        return $this->initial($table[0]) . ' ' . $this->initial($table[1]);
    }

    public function pair(string $sweetheart_a, string $sweetheart_b): string
{
    $a = $this->initials($sweetheart_a);
    $b = $this->initials($sweetheart_b);

    return <<<HEART
     ******       ******
   **      **   **      **
 **         ** **         **
**            *            **
**                         **
**     $a  +  $b     **
 **                       **
   **                   **
     **               **
       **           **
         **       **
           **   **
             ***
              *
HEART;
}
}
