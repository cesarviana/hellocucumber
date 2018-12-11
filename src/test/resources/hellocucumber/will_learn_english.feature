Feature: Will learn english

    Scenario Outline: Will learn english
        Given will talk in hello talk <days>
        When I ask wheter will learn english
        Then The answer is <answer>

    Examples:
        | days | answer |
        | "all days" | "yes!" |
        | "only some days" | "maybe" |
        | "never" | "no, will not learn |
